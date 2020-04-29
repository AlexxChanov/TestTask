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

class NavigationFragment : Fragment(),CoroutineScope {
    override val coroutineContext: CoroutineContext=Dispatchers.Main

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_navigation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val repository = CurrencyRepository()
        launch {
            val currencyy = repository.getCurrency().await()
            val currencyFragment= CurrencyFragment()
            var currencyInput:Double = 0.0
            loader.visibility = View.GONE
            currencyy?.let {
                currencyInput = it.value

                currencyFragment.arguments = Bundle().also {
                    it.putDouble("key", currencyInput)
                }
            }

        monkeyBtn.setOnClickListener {

            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer, MonkeyTresuareFragment())
                ?.addToBackStack(null)
                ?.commit()
        }
        webViewBtn.setOnClickListener {

            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer, currencyFragment)
                ?.addToBackStack(null)
                ?.commit()
        }

    }


}
}