import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.assertThrows
import java.lang.Exception

class CommentTest {

    /**
     * Создаем два поста с id 0 и 1, к посту с id 1 добавляем коммент. Ошибки не выдается
     */
    @Test
    fun createComment (){
        val comments = Comments(1, 1, 1, true, true)
        val coperra = Copyright(1, "a", "b", "c")
        val likes = Likes(10, true, true, true)
        val reps = Reposts(1, true)
        val view = Views(10)
        val donuts = Donut(true, 1, Placeholder(), true, "")


        val post0 = Post(
            0, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place()), emptyArray())

        val post1 = Post(
            0, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place()), emptyArray())

        //Комментс с id пост 1
        val newComment = Comment(1,1,1,"new comment",
            null,null, null, null)

        //инициализация WallService
        val ws = WallService(111)

        ws.add(post0)
        ws.add(post1)


    }

    /**
     * Добавляем коммент к посту c id 1 которого нет, ошибка должна выброситься, проверяем что
     * она выбросилась
     */
    @Test
    fun createComment_withoutPost (){
        val comments = Comments(1, 1, 1, true, true)
        val coperra = Copyright(1, "a", "b", "c")
        val likes = Likes(10, true, true, true)
        val reps = Reposts(1, true)
        val view = Views(10)
        val donuts = Donut(true, 1, Placeholder(), true, "")


        val post0 = Post(
            0, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place()), emptyArray())

        val post1 = Post(
            0, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place()), emptyArray())

        //Комментс с id пост 1
        val newComment = Comment(1,1,1,"new comment",
            null,null, null, null)

        //инициализация WallService
        val ws = WallService(111)

        ws.add(post1)

    //Проверяем что ошибка выбросилась
        Assertions.assertThrows(PostNotFoundException::class.java) {
            ws.createComment(newComment) }
    }
}