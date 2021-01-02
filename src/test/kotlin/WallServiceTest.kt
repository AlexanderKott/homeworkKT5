import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class WallServiceTest {

    /**
     * после добавления поста, id стал равным 1
     */
    @Test
    fun test_add() {
        val comments = Comments(1, 1, 1, true, true)
        val coperra = Copyright(1, "a", "b", "c")
        val likes = Likes(10, true, true, true)
        val reps = Reposts(1, true)
        val view = Views(10)
        val donuts = Donut(true, 1, Placeholder(), true, "")

        //Пост для тестирования id 1
        val post1 = Post(
            1, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place()))

        //Пост для тестирования id 2
        val post2 = Post(
            1, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place()))


        //инициализация WallService
        val ws = WallService(111)

        ws.add(post1) //Добавляем  одну запись

        assertEquals(1, ws.nextID) //Удостоверяемся что id увеличился (стал 1)

        ws.add(post2) //Добавляем еще одну запись

        assertEquals(2, ws.nextID) //Удостоверяемся что id увеличился (стал 2)

    }

    /**
     * Удаляем пост который сущемтвует (с id 0)
     */
    @Test
    fun updateRemoveTest() {

        val comments = Comments(1, 1, 1, true, true)
        val coperra = Copyright(1, "a", "b", "c")
        val likes = Likes(10, true, true, true)
        val reps = Reposts(1, true)
        val view = Views(10)
        val donuts = Donut(true, 1, Placeholder(), true, "")

        //Пост для тестирования id
        val post1 = Post(
            0, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place()))

        //инициализация WallService
        val ws = WallService(111)
        ws.add(post1)  //У поста номер 0

        //Создаем пост с id 0
        val post2 = Post(
            0, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place()))


        assertEquals(ws.update(post2), true)
    }


    /**
     * Удаляем пост который не сущемтвует (с id 5)
     */
    @Test
    fun updateRemoveTest2() {

        val comments = Comments(1, 1, 1, true, true)
        val coperra = Copyright(1, "a", "b", "c")
        val likes = Likes(10, true, true, true)
        val reps = Reposts(1, true)
        val view = Views(10)
        val donuts = Donut(true, 1, Placeholder(), true, "")

        //инициализация WallService
        val ws = WallService(111)

        //Создаем пост с id 5 которого нет в массиве
        val post1 = Post(
            5, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place()))

        assertEquals(ws.update(post1), false)
    }


}