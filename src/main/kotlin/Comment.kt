class Comment(

    var ownerId: Int,
    var postId: Int,
    var fromGroup: Int,
    var message: String,
    var replyToComment: Int?,
    var attachments: Attachment?,
    var stickerId: Int?,
    var guid: String?


)
