package ru.ifmo.backend_2021.markup;

import java.util.List;

public class Strikeout extends MarkdownBlock {
    public Strikeout(List<Block> blocksList){
        super(blocksList, "~");
    }
}
