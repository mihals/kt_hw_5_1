package ru.netology

data class Post(
    val id: Long,
    val ownerId: Long,
    val fromId: Long,
    val createdBy: Long,
    val date: Long,
    val text: String,
    val replyOwnerId: Long,
    val replyPostId: Long,
    val friendsOnly: Boolean,
    val comments: Boolean,
    val copyright: String,
    val likes: Long,
    val reposts: Long,
    val views: Long,
    val postType: String,
    val signerId: Long,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAdds: Boolean,
    val isFavorite: Boolean,
    val postponedId: Long
)

object WallService {
    private var posts = emptyArray<Post>()
}

fun main() {

}