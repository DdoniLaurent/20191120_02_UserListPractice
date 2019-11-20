package com.tioeun.a20191120_02_userlistpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tioeun.a20191120_02_userlistpractice.datas.User
import com.tioeun.a20191120_02_userlistpractice.utils.ConnectServer
import org.json.JSONObject

class MainActivity : BaseActivity() {

    var userList = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }

    override fun onResume() {
        super.onResume()
        getUserListFromServer()
    }

    fun getUserListFromServer() {
        ConnectServer.getRequestUserList(mContext, "ALL", object : ConnectServer.JsonResponseHandler{
            override fun onResponse(json: JSONObject) {
//                Log.d("사용자목록응답",json.toString())

                var code = json.getInt("code")
                if(code == 200) {
                    val data = json.getJSONObject("data")
                    val userArr = data.getJSONArray("users")

                    for (i in 0..userArr.length() -1){
                        val userData = User.getUserFromJson(userArr.getJSONObject(i))
                        userList.add(userData)
                    }
                }
            }

        })
    }


}
