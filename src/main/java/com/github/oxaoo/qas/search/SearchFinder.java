package com.github.oxaoo.qas.search;

/**
 * @author Alexander Kuleshov
 * @version 1.0
 * @since 30.04.2017
 */
public interface SearchFinder<T> {
    T find();
    T find(String s);
}
