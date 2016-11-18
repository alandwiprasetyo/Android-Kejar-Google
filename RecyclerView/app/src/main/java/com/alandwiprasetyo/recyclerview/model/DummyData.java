package com.alandwiprasetyo.recyclerview.model;

/**
 * Created by alandwiprasetyo on 11/19/16.
 */

import java.util.ArrayList;
import java.util.List;

public class DummyData {
    private static List<Word> wordList = new ArrayList<>();

    public static List<Word> dummy() {
        wordList.add(new Word("Alan", "Dwi"));
        wordList.add(new Word("Intan", "Pratiwi"));
        wordList.add(new Word("Desy", "Tri"));
        wordList.add(new Word("Desi", "rahma"));
        wordList.add(new Word("Rochmat", "Mulya"));
        wordList.add(new Word("Rohmat", "Haryadi"));
        return wordList;
    }

}