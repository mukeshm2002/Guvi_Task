// Create calculator UI dynamically using DOM
const calculatorContainer = document.getElementById('calculator');

// Memory storage
let memory = localStorage.getItem('memory') ? parseFloat(localStorage.getItem('memory')) : 0;

// Create calculator UI elements
function createCalculatorUI() {
  const calculator = document.createElement('div');
  calculator.className = 'calculator';

  const memoryDisplay = document.createElement('div');
  memoryDisplay.className = 'memory-display';
  memoryDisplay.id = 'memoryDisplay';
  memoryDisplay.textContent = `Memory: ${memory}`;
  calculator.appendChild(memoryDisplay);

  const screen = document.createElement('input');
  screen.type = 'text';
  screen.id = 'screen';
  screen.className = 'form-control screen mb-3';
  screen.disabled = true;
  calculator.appendChild(screen);

  const buttonValues = [
    ['MC', 'M+', 'M-', 'C'],
    ['7', '8', '9', '/'],
    ['4', '5', '6', '*'],
    ['1', '2', '3', '-'],
    ['0', '.', '=', '+'],
    ['%', '(', ')']
  ];

  buttonValues.forEach(row => {
    const rowDiv = document.createElement('div');
    rowDiv.className = 'row mt-2';

    row.forEach(value => {
      const button = document.createElement('button');
      button.className = `col-3 btn btn-custom ${
        isNaN(value) && value !== '.' ? 'btn-outline-danger' : 'btn-outline-primary'
      }`;
      button.textContent = value;
      button.onclick = () => handleButtonClick(value);
      rowDiv.appendChild(button);
    });

    calculator.appendChild(rowDiv);
  });

  calculatorContainer.appendChild(calculator);
}

createCalculatorUI();

const screen = document.getElementById('screen');
const memoryDisplay = document.getElementById('memoryDisplay');

// Event listener for keyboard events
document.addEventListener('keydown', event => {
  if (!/[0-9.]/.test(event.key)) {
    event.preventDefault();
    alert('Only numbers are allowed');
  } else {
    appendValue(event.key);
  }
});

// Button click handler
function handleButtonClick(value) {
  if (value === 'C') clearScreen();
  else if (value === '=') calculate();
  else if (value === 'MC') memoryClear();
  else if (value === 'M+') memoryAdd();
  else if (value === 'M-') memorySubtract();
  else appendValue(value);
}

// Append value to screen
function appendValue(value) {
  screen.value += value;
}

// Clear screen
function clearScreen() {
  screen.value = '';
}

// Evaluate expression
function calculate() {
  try {
    screen.value = eval(screen.value);
  } catch (error) {
    alert('Invalid Expression');
    clearScreen();
  }
}

// Memory operations
function memoryClear() {
  memory = 0;
  updateMemoryDisplay();
}

function memoryAdd() {
  if (screen.value) {
    memory += parseFloat(screen.value);
    updateMemoryDisplay();
    localStorage.setItem('memory', memory);
  }
}

function memorySubtract() {
  if (screen.value) {
    memory -= parseFloat(screen.value);
    updateMemoryDisplay();
    localStorage.setItem('memory', memory);
  }
}

function updateMemoryDisplay() {
  memoryDisplay.textContent = `Memory: ${memory}`;
}