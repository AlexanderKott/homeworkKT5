



class Audio(override var id: Int, override var albom_id: Int, override var user_id: Int) : Attachment
class Media(override var id: Int, override var albom_id: Int, override var user_id: Int) : Attachment
class Video(override var id: Int, override var albom_id: Int, override var user_id: Int) : Attachment
class Graffity(override var id: Int, override var albom_id: Int, override var user_id: Int) : Attachment
class Note(override var id: Int, override var albom_id: Int, override var user_id: Int) : Attachment

interface Attachment {
    var id : Int
    var albom_id : Int
    var user_id : Int
}