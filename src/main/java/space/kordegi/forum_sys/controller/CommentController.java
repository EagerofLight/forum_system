package space.kordegi.forum_sys.controller;

import common.lang.Result;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import space.kordegi.forum_sys.entity.Comment;
import space.kordegi.forum_sys.service.CommentService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kordegi
 * @date 2024.03.06 5:44
 * @Description
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Resource
    private CommentService commentService;

    @GetMapping("/getComments/{parentCommentId}")
    public Result<Map> getCommentList(@PathVariable int parentCommentId,
                                      @RequestParam int pageNumber,
                                      @RequestParam int pageSize) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", "200");
        map.put("CommentList", commentService.getComments(parentCommentId, pageNumber, pageSize));
        return Result.succ(map);
    }

    @PostMapping("/add")
    public Result<String> addComment(@Validated Comment comment) {
        boolean flag = commentService.addComment(comment);
        return flag ? Result.succ("Comment added successfully") : Result.fail(500,"Comment add failed");
    }

    @GetMapping("/getHotComments")
    public Result<Map> getHotCommentList(@RequestParam int pageNumber,
                                      @RequestParam int pageSize) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", "200");
        map.put("CommentList", commentService.getHotComments(pageNumber, pageSize));
        return Result.succ(map);
    }
}
