class WallService(size :Int) {

            var nextID: Int = 0
    private var arrayOfPosts: Array<Post?> = arrayOfNulls(size)
    private var comments : Array<Comment?> = arrayOfNulls(size)


    fun createComment(comment: Comment) {
        for (n in arrayOfPosts){
            if (n?.id == comment.postId){
                comments[comment.postId] = comment
                return
            }
        }
        throw PostNotFoundException("PostNotFoundException")
    }

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
                n.replyOwnerId  = post.replyOwnerId
                n.replyPossId  = post.replyPossId
                n.friendsOnly  = post.friendsOnly
                n.comments = post.comments
                n.copyright = post.copyright
                n.likes = post.likes
                n.reposts = post.reposts
                n.views = post.views
                n.postType = post.postType
                n.canPin = post.canPin
                n.canDelete = post.canDelete
                n.canEdit = post.canEdit
                n.isPinned = post.isPinned
                n.markedAsAds = post.markedAsAds
                n.isFavorite = post.isFavorite
                n.postponedId = post.postponedId
                n.donut = post.donut
                n.signerId  = post.signerId
                n.geo  = post.geo
                n.attechments = post.attechments
                return true
            }
        }
        return false
    }

}



