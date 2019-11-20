package com.tioeun.a20191120_02_userlistpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tioeun.a20191120_02_userlistpractice.utils.ConnectServer
import org.json.JSONObject

class UserDetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_detail)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        getCategoryListFromServer()
    }

    fun getCategoryListFromServer(){
        ConnectServer.getRequestCategoryList(mContext, object : ConnectServer.JsonResponseHandler{
            override fun onResponse(json: JSONObject) {
                Log.d("카테고리응답", json.toString())
            }

        })
    }

}
