package br.senai.sp.jandira.lazycolumnroom.dao.repository

import android.content.Context
import br.senai.sp.jandira.lazycolumnroom.dao.ProductDb
import br.senai.sp.jandira.lazycolumnroom.model.Product

class ProductRepository(context: Context) {

    private  val db = ProductDb.getDatabase(context) //- colocar a Dao ao chamar o db (usasse quando tem muitos DAO)
    //private  val db = ProductDb.getDatabase(context).productDao() - caso tenha apenas uma dao
        fun getProductsList(): List<Product> {
            return db.productDao().getAll()
        }

        fun save(product: Product): Long{
           return db.productDao().save(product)
        }

}