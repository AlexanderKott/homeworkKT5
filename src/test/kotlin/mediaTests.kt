import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*


class mediaTests {

    @Test
    fun test_Audio(){
        val comments = Comments(1, 1, 1, true, true)
        val coperra = Copyright(1, "a", "b", "c")
        val likes = Likes(10, true, true, true)
        val reps = Reposts(1, true)
        val view = Views(10)
        val donuts = Donut(true, 1, Placeholder(), true, "")

        val audio = Audio(1,1,1)

        //Пост для тестирования id 1
        val post1 = Post(
            1, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place())
            , Array(1){audio} )


        assertEquals(post1.att[0].id, 1)

    }

    @Test
    fun test_Video(){
        val comments = Comments(1, 1, 1, true, true)
        val coperra = Copyright(1, "a", "b", "c")
        val likes = Likes(10, true, true, true)
        val reps = Reposts(1, true)
        val view = Views(10)
        val donuts = Donut(true, 1, Placeholder(), true, "")

        val video = Video(1,1,1)

        //Пост для тестирования id 1
        val post1 = Post(
            1, 1, 1, 1, 1, "text",
            1, 1, true, comments, coperra, likes, reps, view, "str", true,
            true, true, true, true,
            true, 1, donuts,1, Geo("","", Place())
            , Array(1){video} )


        assertEquals(post1.att[0].id, 1)

    }

}