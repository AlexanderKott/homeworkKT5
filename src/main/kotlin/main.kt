

data class Comments (
  val  count : Int,
  val  can_post:Int,
  val  groups_can_post:Int,
  val  can_close: Boolean,
  val  scanOpen: Boolean
)


data class  Copyright(
    val id: Int,
    val link: String,
    val name: String,
    val type: String
)

data class Likes(
   val count : Int,
   val userLikes: Boolean,
   val canLike: Boolean ,
   val canPublish: Boolean

)
data class Reposts(
    val count: Int,
    val userReposted : Boolean

)
data class Views(
    val count: Int
)

data class Donut (
 val  is_donut: Boolean,
 val  paid_duration: Int ,
 val  placeholder: Placeholder,
 val  can_publish_free_copy: Boolean,
 val  edit_mode : String
)


class Placeholder
class Place

data class Geo (
    var type: String?,
    var coords : String?,
    var place: Place?
    )


fun main() {
      
}
