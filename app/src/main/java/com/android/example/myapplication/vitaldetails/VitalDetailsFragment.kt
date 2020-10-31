package com.android.example.myapplication.vitaldetails

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.android.example.myapplication.R
import com.android.example.myapplication.VitalTrackingApplication
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.components.XAxis.XAxisPosition
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet


class VitalDetailsFragment : Fragment() {

    private lateinit var severityBarChart: BarChart
    private val args: VitalDetailsFragmentArgs by navArgs()

    override fun onAttach(context: Context) {
        super.onAttach(context)

        (activity as AppCompatActivity).supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true);
            val icon = ContextCompat.getDrawable(
                this@VitalDetailsFragment.requireContext(),
                R.drawable.ic_baseline_arrow_back_24
            );
            setHomeAsUpIndicator(icon);
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.vital_details_fragment, null)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        severityBarChart = view!!.findViewById<BarChart>(R.id.vital_chart)
        initializeBarChart()
        setupListAdapter()
    }

    private fun initializeBarChart() {
        severityBarChart.getDescription().setEnabled(false)

        severityBarChart.getXAxis().setDrawGridLines(false)
        // scaling can now only be done on x- and y-axis separately
        severityBarChart.setPinchZoom(false)
        severityBarChart.setDrawBarShadow(false)
        severityBarChart.setDrawGridBackground(false)
        val xAxis: XAxis = severityBarChart.getXAxis()
        xAxis.setDrawGridLines(false)
        severityBarChart.getAxisLeft().setDrawGridLines(false)
        severityBarChart.getAxisRight().setDrawGridLines(false)
        severityBarChart.getAxisRight().setEnabled(false)
        severityBarChart.getAxisLeft().setEnabled(true)
        severityBarChart.getXAxis().setDrawGridLines(false)
        // add a nice and smooth animation
        //  severityBarChart.animateY(1500)
        severityBarChart.getLegend().setEnabled(false)
        severityBarChart.getAxisRight().setDrawLabels(false)
        severityBarChart.getAxisLeft().setDrawLabels(true)
        severityBarChart.setTouchEnabled(false)
        severityBarChart.setDoubleTapToZoomEnabled(false)
        severityBarChart.getXAxis().setEnabled(true)
        severityBarChart.getXAxis().setPosition(XAxisPosition.BOTTOM)
        severityBarChart.invalidate()
    }

    private fun setupListAdapter() {

        severityBarChart?.let {

            val vital = args.vital
            val values = ArrayList<BarEntry>()

            vital?.let {
                val xAxisData = vital.dates
                val yAxisData = vital.values

                for (i in 0 until xAxisData.size) {
                    val y = yAxisData.get(i).replace(':', '.')
                    values.add(BarEntry(i.toFloat(), y.toFloat()))
                }


                val set1: BarDataSet;

                if (severityBarChart.getData() != null &&
                    severityBarChart.getData().getDataSetCount() > 0
                ) {
                    set1 = severityBarChart.data.getDataSetByIndex(0) as BarDataSet
                    set1.setValues(values);
                    severityBarChart.getData().notifyDataChanged();
                    severityBarChart.notifyDataSetChanged();
                } else {
                    set1 = BarDataSet(values, "Data Set");
                    //  set1.setColors(SessionManagement.MATERIAL_COLORS);
                    set1.setDrawValues(true);

                    val dataSets = ArrayList<IBarDataSet>()
                    dataSets.add(set1);

                    val data = BarData(dataSets);
                    severityBarChart.setData(data);
                    //severityBarChart.setVisibleXRange(1f, 4f);
                    //severityBarChart.setFitBars(true);
                    val xAxis = severityBarChart.getXAxis();
                    xAxis.setGranularity(1f);
                    xAxis.setGranularityEnabled(true);
                    xAxis.setValueFormatter(IndexAxisValueFormatter(xAxisData));//setting String values in Xaxis
                    for (set in severityBarChart.data.getDataSets())
                        set.setDrawValues(!set.isDrawValuesEnabled());

                    severityBarChart.invalidate();
                }
            }

        }
    }
}