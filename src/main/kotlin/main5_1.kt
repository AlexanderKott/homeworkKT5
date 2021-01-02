

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

data class Post constructor (
    var id: Int,
    var owner_id: Int,
    var from_id: Int,
    var created_by: Int,
    var date: Int,
    var text: String?,
    var reply_owner_id: Int,
    var reply_post_id: Int,
    var friends_only: Boolean,
    var comments: Comments?,
    var copyright: Copyright?,
    var likes: Likes?,
    var reposts: Reposts?,
    var views: Views?,
    var post_type: String,
    var can_pin: Boolean,
    var can_delete: Boolean,
    var can_edit: Boolean,
    var is_pinned: Boolean,
    var marked_as_ads: Boolean,
    var is_favorite: Boolean?,
    var postponed_id: Int,
    var donut: Donut,
    var signerId: Int,
    var geo: Geo,
    var att: Array<Attachment>
    )



fun main() {
      
}
