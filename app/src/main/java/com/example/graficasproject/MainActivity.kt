package com.example.graficasproject

import android.content.ContentValues.TAG
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.github.mikephil.charting.animation.Easing
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.components.AxisBase
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.github.mikephil.charting.formatter.PercentFormatter
import com.github.mikephil.charting.utils.ColorTemplate

class MainActivity : AppCompatActivity() {

    private lateinit var pieChart: PieChart
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupPieChar()
    }

    private fun setupPieChar()
    {
        pieChart = findViewById(R.id.cuadro)
        val pieEntries = arrayListOf<PieEntry>()
        pieEntries.add(PieEntry(30.0f))
        pieEntries.add(PieEntry(40.0f))
        pieEntries.add(PieEntry(35.0f))

        pieChart.animateXY(1000,1000)

        val pieDataSet = PieDataSet(pieEntries, "Pie chart")
        pieDataSet.setColors(
            resources.getColor(R.color.design_default_color_primary_dark),
            resources.getColor(R.color.design_default_color_secondary),
            resources.getColor(R.color. design_default_color_error)
        )


        val pieData =  PieData(pieDataSet)

        pieData.setDrawValues(true)


        pieChart.data=pieData
    }



}