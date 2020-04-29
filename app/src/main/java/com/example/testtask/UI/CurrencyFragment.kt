package com.example.testtask.UI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.testtask.Data.CurrencyRepository
import com.example.testtask.R
import kotlinx.android.synthetic.main.fragment_currency.*
import kotlinx.android.synthetic.main.fragment_navigation.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class CurrencyFragment: Fragment(),CoroutineScope {
    override val coroutineContext: CoroutineContext = Dispatchers.Main
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_currency, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        val repository = CurrencyRepository()
//        launch {
//            val currencyy = repository.getCurrency().await()
//
//            activity?.loader?.visibility = View.GONE
//
//
//            currencyy?.let {
//                currency.text = it.value.toString()
//            }

        //}
        currency.text=arguments?.getDouble("key").toString()
        currencyBtn.setOnClickListener {

            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer, WebViewFragment())
                ?.addToBackStack(null)
                ?.commit()
        }
    }
}