package com.yusufsoysal.algorithms.interview;

import java.util.*;
import java.util.stream.Collectors;

/*
 * Given a list of words, produce an algorithm that will return a list of all anagrams for a specific word.
 */
public class FindAnagramsInList {

    private final Map<String, List<String>> signatureMap;

    public FindAnagramsInList(List<String> words) {
        signatureMap = words.stream()
                .collect(Collectors.toMap(this::createSignature,
                        this::createWordList,
                        this::mergeLists));

    }

    private List<String> mergeLists(List<String> firstList, List<String> secondList) {
        firstList.addAll(secondList);
        return firstList;
    }

    private List<String> createWordList(String word) {
        List<String> wordList = new ArrayList<>();
        wordList.add(word);

        return wordList;
    }

    private String createSignature(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public List<String> find(String word) {
        if( word == null ){
            return Collections.<String>emptyList();
        }

        String signature = createSignature(word);
        List<String> anagramWords = signatureMap.get(signature);
        if (anagramWords == null) {
            anagramWords = Collections.<String>emptyList();
        }

        return anagramWords;
    }
}
