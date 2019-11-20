package com.tioeun.a20191120_02_userlistpractice.datas

import org.json.JSONObject

class Category {

    var id = 0
    var title = ""
    var color = ""
    
    companion object {
        fun getCategoryFromJson(cateJson:JSONObject) : Category {
            var category = Category()
            category.id = cateJson.getInt("id")
            category.title = cateJson.getString("title")
            category.color = cateJson.getString("color")
            return category
        }
    }
}