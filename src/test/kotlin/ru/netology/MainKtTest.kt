package ru.netology

import Post
import WallService

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
class WallServiceTest {
    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(1, 2, "3", "4", 5, "6", 7, 8, 9))
        service.add(Post(11, 12, "13", "14", 15, "16", 17, 18, 19))
        service.add(Post(21, 22, "23", "24", 25, "26", 27, 28, 29))
        // создаём информацию об обновлении
        val update = Post(11, 32, "33", "34", 35, "36", 37, 38, 39)

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        Assert.assertEquals(-1, result)
    }
}