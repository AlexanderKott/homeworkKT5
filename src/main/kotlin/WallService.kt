class WallService {

    var nextID: Int = 0
    private var arrayOfPosts: Array<Post?> = arrayOfNulls(100_000)


    fun add(post: Post): Post {
        post.id = nextID
        arrayOfPosts[nextID] = post
        nextID++
        return post
    }

    fun update(post: Post): Boolean {
        for (n in arrayOfPosts) {
            if (post.id == n?.id) {
                //update
                n.owner_id = post.owner_id
                n.from_id = post.from_id
                n.created_by = post.created_by
                n.text = post.text
                n.reply_owner_id = post.reply_owner_id
                n.reply_post_id = post.reply_post_id
                n.friends_only = post.friends_only
                n.comments = post.comments
                n.copyright = post.copyright
                n.likes = post.likes
                n.reposts = post.reposts
                n.views = post.views
                n.post_type = post.post_type
                n.can_pin = post.can_pin
                n.can_delete = post.can_delete
                n.can_edit = post.can_edit
                n.is_pinned = post.is_pinned
                n.marked_as_ads = post.marked_as_ads
                n.is_favorite = post.is_favorite
                n.postponed_id = post.postponed_id
                n.donut = post.donut

                return true
            }

        }

        return false
    }

}



