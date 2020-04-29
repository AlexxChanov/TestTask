package com.example.testtask.UI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.testtask.R
import kotlinx.android.synthetic.main.fragment_monkey.*
import kotlinx.android.synthetic.main.fragment_monkey.view.*
import kotlinx.android.synthetic.main.fragment_monkey.view.table
import kotlinx.android.synthetic.main.fragment_navigation.*

class MonkeyTresuareFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_monkey, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        tableBtn.setOnClickListener {
            table.visibility=View.INVISIBLE
            if (imageScorpio.visibility==View.VISIBLE){
                imageScorpio.visibility=View.INVISIBLE
            } else if (imageSnake.visibility==View.VISIBLE){
                imageSnake.visibility=View.INVISIBLE
            }
            btn1.setBackgroundResource(R.drawable.trava)
            btn10.setBackgroundResource(R.drawable.trava)
            btn19.setBackgroundResource(R.drawable.trava)
            btn28.setBackgroundResource(R.drawable.trava)
            btn37.setBackgroundResource(R.drawable.trava)
            btn38.setBackgroundResource(R.drawable.trava)
            btn39.setBackgroundResource(R.drawable.trava)
            btn40.setBackgroundResource(R.drawable.trava)
            btn41.setBackgroundResource(R.drawable.trava)
            btn42.setBackgroundResource(R.drawable.trava)
            btn51.setBackgroundResource(R.drawable.trava)
            btn60.setBackgroundResource(R.drawable.trava)
            btn69.setBackgroundResource(R.drawable.trava)
            btn78.setBackgroundResource(R.drawable.trava)
            btn79.setBackgroundResource(R.drawable.trava)
            btn80.setBackgroundResource(R.drawable.trava)
            btn81.setBackgroundResource(R.drawable.trava)


            }


        btn2.setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn3.setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE

        }
        btn4 . setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn5 . setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn6 . setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn7 . setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn8 . setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn9 . setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn11 . setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn12 . setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }

        btn13.setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn14.setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn15. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn16. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn17. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE

        }
        btn18. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn20. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn21. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn22. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn23. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }

        btn24.setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn25.setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn26. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn27. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn29. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn30. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn31. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn32. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn33. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn34. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }

        btn35.setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn36.setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn43. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn44. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }

        btn45. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn46. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn47. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn48. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn49. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn50. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }

        btn52.setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn53.setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn54. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn55. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn56. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn57. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn58. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn59. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn61. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn62. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }


        btn63.setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn64.setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn65. setOnClickListener {

            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn66. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn67. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn68. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn70. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn71. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn72. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn73. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }

        btn74.setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }

        btn75.setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }
        btn76. setOnClickListener {
            onSnakeClick()
            imageSnake.visibility=View.VISIBLE
        }
        btn77. setOnClickListener {
            onSnakeClick()
            imageScorpio.visibility=View.VISIBLE
        }


        //Right way buttons


        btn1.setOnClickListener {
            it.setBackgroundColor(resources.getColor(R.color.colorPrimary))
            onSnakeClick()
            textTable.text="Ты помог мартышке найти золото! Сыграем еще раз?"
            imageSnake.visibility=View.GONE
            imageScorpio.visibility=View.GONE

        }
        btn10.setOnClickListener {
            it.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }
        btn19.setOnClickListener {
            it.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }
        btn28.setOnClickListener {
            it.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }
        btn37.setOnClickListener {
            it.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }
        btn38.setOnClickListener {
            it.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }
        btn39.setOnClickListener {
            it.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }
        btn40.setOnClickListener {
            it.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }
        btn41.setOnClickListener {
            it.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }
        btn42.setOnClickListener {
            it.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }
        btn51.setOnClickListener {
            it.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }
        btn60.setOnClickListener {
            it.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }
        btn69.setOnClickListener {
            it.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }
        btn78.setOnClickListener {
            it.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }
        btn79.setOnClickListener {
            it.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }
        btn80.setOnClickListener {
            it.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }
        btn81.setOnClickListener {
            it.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }
    }

    fun onSnakeClick() {
        table.visibility = View.VISIBLE
    }
}