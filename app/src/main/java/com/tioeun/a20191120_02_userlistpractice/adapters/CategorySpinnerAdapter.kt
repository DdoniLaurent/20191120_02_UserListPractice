package com.tioeun.a20191119_01_banklistpractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.tioeun.a20191120_02_userlistpractice.R
import com.tioeun.a20191120_02_userlistpractice.datas.Category
import com.tioeun.a20191120_02_userlistpractice.datas.User
import java.util.ArrayList

class CategorySpinnerAdapter(context: Context, res : Int, list:ArrayList<Category>) : ArrayAdapter<Category>(context,res,list) {
    var mContext = context
    var mList = list
    var inf = LayoutInflater.from(mContext)

    constructor(context: Context, list:ArrayList<Category>) : this(context, R.layout.category_spinner_list_item, list)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null) {
            tempRow = inf.inflate(R.layout.category_spinner_list_item, null)
        }

        var row = tempRow!!



        return row
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getDropDownView(position, convertView, parent)
    }


}