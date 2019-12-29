package com.ribuluo.admin.model.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 */
@Data
public class TreeNode {

    protected int id;
    protected int parentId;
    protected List<TreeNode> children = new ArrayList<TreeNode>();
    public void add(TreeNode node) {
        children.add(node);
    }
}
