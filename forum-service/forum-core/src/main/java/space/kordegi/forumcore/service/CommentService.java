package space.kordegi.forumcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import space.kordegi.forumcore.dao.CommentMapper;
import space.kordegi.forumcore.entity.Comment;

import java.util.List;

/**
 * @author kordegi
 * @date 2024.03.06 5:36
 * @Description
 */
@Service
public class CommentService {

    @Autowired
    private CommentMapper commentMapper;

    public List<Comment> getComments(Integer parentCommentId, int pageNumber, int pageSize) {
        return commentMapper.getComments(parentCommentId, pageNumber, pageSize);
    }

    public boolean addComment(Comment comment) {
        commentMapper.addComment(comment.getUserId(), comment.getBody(), comment.getParentCommentId(), comment.getLikes());
        return true; //TODO
    }

    public List<Comment> getHotComments(int pageNumber, int pageSize) {
        return commentMapper.getHotComments(pageNumber, pageSize);
    }
}
