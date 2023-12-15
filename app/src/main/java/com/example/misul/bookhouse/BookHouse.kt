package com.example.misul.bookhouse

import android.app.Application

import com.example.misul.bookhouse.data.AppContainer
import com.example.misul.bookhouse.data.BookNotesDatabase
import com.example.misul.bookhouse.data.DefaultAppContainer
import com.example.misul.bookhouse.data.MyBooksDatabase


class BookHouse : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        try {
            val myBooksDatabase = MyBooksDatabase.getDatabase(applicationContext)
            val notesBooksDatabase = BookNotesDatabase.getDatabase(applicationContext)
            container = DefaultAppContainer(myBooksDatabase, notesBooksDatabase)
        }
        catch (e: Exception) {
            // Обработка ошибки и вывод в консоль
            e.printStackTrace()
        }

    }
}


