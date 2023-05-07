
data class Post(
    val id: Int,
    val autorId: Int,
    val autorName: String,
    val content: String,
    val published: Long,
    val comment: String,
    val canPin: Int,
    val canDelite: Int,
    val isFavorite: Int
)
data class Likes (
    val count:Int,
    val userLike: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean,
    var likes: Int = 0
)

object WallService {//синглтон //сервис отвечающий за публикацию постов
    var posts = emptyArray<Post>()//создаем массив
    var counterId=0

    fun add(post: Int): Post {//добавление нового поста

        posts += post.copy(id = counterId ++)
        return posts.last()
    }
    fun update (newPost: Post):Boolean {//Обновление поста
        for ((index, post) in posts.withIndex()){
            if (post.id == newPost.id){
                posts [index] = newPost.copy()
                return true
            }
        }
        return false
    }
}

fun main (){
    val post = Post (
        1,
        1,
        "author",
        "content",
        0,
        "New comment",
        0,
        1,
        0,
        )
    println(post)
}

