package com.example.homework1_android3.ui.datas

import com.example.homework1_android3.ui.models.Model

class StoryData {

    private var list: ArrayList<Model> = ArrayList()

    fun setList(): List<Model> {
        list.add(Model("Человек за окном"))
        list.add(Model("Статуя ангела"))
        list.add(Model("Зеркало в шкафу"))
        list.add(Model("Хитрый гость"))
        list.add(Model("Звонки из магилы"))
        list.add(Model("Ужасы ночной школы"))
        list.add(Model("Незваные гости"))
        list.add(Model("Прндсмертная переписка"))
        list.add(Model("Отверстие"))
        list.add(Model("Видеокасеты"))
        list.add(Model("Линолиум"))

        return list
    }
}