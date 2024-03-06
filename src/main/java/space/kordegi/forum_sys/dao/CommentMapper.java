package space.kordegi.forum_sys.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import space.kordegi.forum_sys.entity.Comment;

import java.util.List;

/**
 * @author kordegi
 * @date 2024.03.06 9:24
 * @Description
 */
@Mapper
public interface CommentMapper {
    @Select("CALL get_comments(#{parentCommentId}, #{pageNumber}, #{pageSize})")
    List<Comment> getComments(@Param("parentCommentId") Integer parentCommentId,
                              @Param("pageNumber") int pageNumber,
                              @Param("pageSize") int pageSize);

    @Select("CALL add_comment(#{userId}, #{body}, #{parentCommentId}, #{likes})")
    void addComment(@Param("userId") Integer userId,
                    @Param("body") String body,
                    @Param("parentCommentId") Integer parentCommentId,
                    @Param("likes") Integer likes);

    @Select("CALL get_hot_comments(#{pageNumber}, #{pageSize})")
    List<Comment> getHotComments(@Param("pageNumber") int pageNumber,
                                 @Param("pageSize") int pageSize);
}
