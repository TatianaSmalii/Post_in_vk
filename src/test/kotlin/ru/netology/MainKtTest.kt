package ru.netology

import Post
import WallService.add
import WallService.update
import org.junit.Assert
import org.junit.Test

class MainKtTest {
    @Test
    fun add1() {
        val id =1

        val post= 0
        val result = add (post= post )
        //Помогите пожалуйста понять как прописать тесты add и update
        //Хочу разобраться
        //Если проверять этот тест то выскакивает ошибка Unresolved reference: copy (27 строка)
        Assert.assertEquals(-1, result)
    }
    @Test
    fun update (){
        val id=0
        val result = update (newPost = newPost)
        Assert.assertEquals(-1, result)
    }
}