

class VideoAttachment : Attachment {
    override var type: String="video"
    val video: Video=Video(1,1,1)
}

class AudioAttachment : Attachment {
    override var type: String="audio"
    val audio: Audio = Audio(1,1,1)
}

class DocAttachment : Attachment {
    override var type: String="doc"
    val doc: Doc=Doc(1,1,1)
}

class GraffityAttachment : Attachment {
    override var type: String="graffity"
    val graffity: Graffity= Graffity(1,1,1)
}

class NoteAttachment : Attachment {
    override var type: String="note"
    val Note: Note=Note(1,1,1)
}