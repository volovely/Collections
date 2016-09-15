package com.example.roman.collections;

/**
 * Created by Roman on 14.09.2016.
 */
public class Person {
    private String _image_link;
    private String _fname;
    private String _lname;

    public Person(String _fname, String _image_link, String _lname) {
        this._fname = _fname;
        this._image_link = _image_link;
        this._lname = _lname;
    }

    public String get_fname() {
        return _fname;
    }

    public void set_fname(String _fname) {
        this._fname = _fname;
    }

    public String get_image_link() {
        return _image_link;
    }

    public void set_image_link(String _image_link) {
        this._image_link = _image_link;
    }

    public String get_lname() {
        return _lname;
    }

    public void set_lname(String _lname) {
        this._lname = _lname;
    }
}
