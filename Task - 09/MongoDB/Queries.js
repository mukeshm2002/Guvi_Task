// Find all products
db.products.find()

// Find products with prices between 400 and 800
db.products.find({ product_price: { $gte: 400, $lte: 800 } })

//Find products with prices not between 400 and 600
db.products.find({ $or: [{ product_price: { $lt: 400 } }, { product_price: { $gt: 600 } }] })

//List four products with prices greater than 500
db.products.find({ product_price: { $gt: 500 } }).limit(4)

//Find the product name and product material of each product
db.products.find({}, { product_name: 1, product_material: 1, _id: 0 })

//Find the product with a row ID of 10
db.products.find({ id: "10" })

//Find products containing "soft" in product material
db.products.find({ product_material: { $regex: "soft", $options: "i" } })

//Find products with color "indigo" and price "492.00"
db.products.find({ product_color: "indigo", product_price: 492.00 })

//Delete products with duplicate prices
db.products.aggregate([
    { $group: { _id: "$product_price", count: { $sum: 1 }, docs: { $push: "$_id" } } },
    { $match: { count: { $gt: 1 } } }
]).forEach(group => {
    db.products.deleteMany({ _id: { $in: group.docs.slice(1) } })
})



