package com.secondgroup.web.cloudmusicweb.service.impl;

import com.secondgroup.web.cloudmusicweb.entity.Comment;
import com.secondgroup.web.cloudmusicweb.mapper.CommentMapper;
import com.secondgroup.web.cloudmusicweb.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author secondground
 * @since 2018-09-21
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
