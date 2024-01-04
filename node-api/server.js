const express = require('express')
const app = express()
const mongoose = require('mongoose')
const Product = require('./models/productModel')

app.use(express.json())

// routes
app.get('/', (req, res) => {
  res.send('Hello NodeAPI');
})

app.get('/blog', (req, res) => {
  res.send('Hello Blog, My name is Sunil')
})

app.get('/products', async(req, res) => {
  try {
      const products = await Product.find({});
      res.status(200).json(products);
  } catch (error) {
    res.status(500).json({message: error.message})
  }
})

app.get('/products/:id', async(req, res) => {
  try {
    const {id} = req.params;
    const product = await Product.findById(id)
    res.status(200).json(product)
  } catch (error) {

  }
})

app.post('/product', async(req, res) => {
  try {
      const product = await Product.create(req.body)
      res.status(200).json(product); 
  } catch(error) {
    console.log(error.message)
    res.send(500).json({message: error.message})
  }
})

app.put('/product/:id', async(req, res) => {
  try {
    const {id} = req.params;
    const product = await Product.findByIdAndUpdate(id, req.body);
    // we cannot find any product with this id in the db
    if (!product) {
      return res.status(404).json({message: `cannot find any product with ID ${id}`})
    }
    const updatedProduct = await Product.findById(id);
    res.status(200).json(updatedProduct)
  } catch (error) {
    res.json(500).json({message: error.message})
  }
})

app.delete('/products/:id', async(req, res) => {
  try {
    const {id} = req.params;
    const product = await Product.findByIdAndDelete(id);
    if(!product){
      return res.status(404).json({message: `cannot find any product with ID ${id}`})
    }
    res.status(200).json(product)
  } catch (error) {
    res.json(500).json({message: error.message})
  }
})

mongoose.connect('mongodb+srv://javascriptmastery:javascriptmastery123@cluster0.ecf9e.mongodb.net/node-api?retryWrites=true&w=majority')
.then(() => {
  console.log('connected to mongodb')
  app.listen(3000, () => {
    console.log("server started");
  });
}).catch((error) => {
  console.log(error)
})