package com.example.calculator

import android.app.ProgressDialog.show
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val list1 = arrayOf("Anime", "Realism", "Scenery", "Abstract")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

        val animDrawable = root_layout.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(3000)
        animDrawable.start()


        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, list1)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
        spinner2.adapter = adapter
        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
        val bottomSheetModal = bottomsheetmodal()
        showmodal.setOnClickListener{
            bottomSheetModal.show(supportFragmentManager, "BottomSheetDialogue")
        }
        button.setOnClickListener {
            if (spinner.selectedItemPosition == 0 && spinner2.selectedItemPosition == 0) {
                try {
                    val output: String = applicationContext.assets.open("anya.txt").bufferedReader().use{
                        it.readText()
                    }

                    // Data is displayed in the TextView
                    asciiRes.text = output
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
            else if ((spinner.selectedItemPosition == 1 && spinner2.selectedItemPosition == 0) || (spinner.selectedItemPosition == 0 && spinner2.selectedItemPosition == 1)) {
                try {
                    val output: String = applicationContext.assets.open("makima.txt").bufferedReader().use{
                        it.readText()
                    }

                    // Data is displayed in the TextView
                    asciiRes.text = output
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
            else if ((spinner.selectedItemPosition == 2 && spinner2.selectedItemPosition == 0) || (spinner.selectedItemPosition == 0 && spinner2.selectedItemPosition == 2)) {
                try {
                    val output: String = applicationContext.assets.open("animescenery.txt").bufferedReader().use{
                        it.readText()
                    }

                    // Data is displayed in the TextView
                    asciiRes.text = output
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
            else if ((spinner.selectedItemPosition == 3 && spinner2.selectedItemPosition == 0) || (spinner.selectedItemPosition == 0 && spinner2.selectedItemPosition == 3)) {
                try {
                    val output: String = applicationContext.assets.open("animeabstract.txt").bufferedReader().use{
                        it.readText()
                    }

                    // Data is displayed in the TextView
                    asciiRes.text = output
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
            else if (spinner.selectedItemPosition == 1 && spinner2.selectedItemPosition == 1) {
                try {
                    val output: String = applicationContext.assets.open("apple.txt").bufferedReader().use{
                        it.readText()
                    }

                    // Data is displayed in the TextView
                    asciiRes.text = output
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
            else if ((spinner.selectedItemPosition == 1 && spinner2.selectedItemPosition == 2) || (spinner.selectedItemPosition == 2 && spinner2.selectedItemPosition == 1)) {
                try {
                    val output: String = applicationContext.assets.open("swissalps.txt").bufferedReader().use{
                        it.readText()
                    }

                    // Data is displayed in the TextView
                    asciiRes.text = output
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
            else if ((spinner.selectedItemPosition == 1 && spinner2.selectedItemPosition == 3) || (spinner.selectedItemPosition == 3 && spinner2.selectedItemPosition == 1)) {
                try {
                    val output: String = applicationContext.assets.open("picasso.txt").bufferedReader().use{
                        it.readText()
                    }

                    // Data is displayed in the TextView
                    asciiRes.text = output
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
            else if (spinner.selectedItemPosition == 2 && spinner2.selectedItemPosition == 2) {
                try {
                    val output: String = applicationContext.assets.open("earth.txt").bufferedReader().use{
                        it.readText()
                    }

                    // Data is displayed in the TextView
                    asciiRes.text = output
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
            else if ((spinner.selectedItemPosition == 2 && spinner2.selectedItemPosition == 3) || (spinner.selectedItemPosition == 3 && spinner2.selectedItemPosition == 2)) {
                try {
                    val output: String = applicationContext.assets.open("abstractscenery.txt").bufferedReader().use{
                        it.readText()
                    }

                    // Data is displayed in the TextView
                    asciiRes.text = output
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
            else if (spinner.selectedItemPosition == 3 && spinner2.selectedItemPosition == 3) {
                try {
                    val output: String = applicationContext.assets.open("abstract.txt").bufferedReader().use{
                        it.readText()
                    }

                    // Data is displayed in the TextView
                    asciiRes.text = output
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
    }
}


