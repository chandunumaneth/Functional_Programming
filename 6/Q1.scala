object Inventory extends App {
  type ProductID = Int

  case class Product(name: String, quantity: Int, price: Double)

  val inventory1: Map[ProductID, Product] = Map(
    101 -> Product("Apple", 10, 100.20),
    102 -> Product("Banana", 12, 50.25),
    103 -> Product("Grapes", 20, 30.45)
  )

  val inventory3 : Map[ProductID, Product] = Map(

  )

  val inventory2: Map[ProductID, Product] = Map(
    102 -> Product("Banana", 10, 60.50),
    104 -> Product("Papaya", 3, 40.25)
  )

  def retrieveProductNames(inventory: Map[ProductID, Product]): Seq[String] = {
    inventory.values.map(_.name).toSeq
  }

  def totalValue(inventory: Map[ProductID, Product]): Double = {
    inventory.values.map(product => product.quantity * product.price).sum
  }

  def isInventoryEmpty(inventory: Map[ProductID, Product]): Boolean = {
    inventory.isEmpty
  }

  def mergeInventories(inv1: Map[ProductID, Product], inv2: Map[ProductID, Product]): Map[ProductID, Product] = {
    inv2.foldLeft(inv1) { case (acc, (id, product)) =>
      acc.get(id) match {
        case Some(existingProduct) =>
          acc.updated(id, Product(
            existingProduct.name,
            existingProduct.quantity + product.quantity,
            existingProduct.price.max(product.price)
          ))
        case None =>
          acc + (id -> product)
      }
    }
  }

  def productExist(inventory: Map[ProductID, Product], productID: Int): Unit = {
    inventory.get(productID) match {
      case Some(product) => println(s"Product ID: $productID, Details: $product")
      case None => println(s"Product ID $productID does not exist!")
    }
  }

  println(s"Product Names in Inventory 1: ${retrieveProductNames(inventory1)}")

  println(s"Total value of Inventory 1: ${totalValue(inventory1)}")

  println(s"Is Inventory 1 empty? ${isInventoryEmpty(inventory1)}")

  println(s"Is Inventory 3 empty? ${isInventoryEmpty(inventory3)}")

  val mergedInventory = mergeInventories(inventory1, inventory2)

  println(s"Merged Inventories: $mergedInventory")

  val checkID = 102

  productExist(inventory1, checkID)
}
