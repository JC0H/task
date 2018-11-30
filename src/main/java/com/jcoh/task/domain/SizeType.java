package com.jcoh.task.domain;

public enum SizeType {
    S{
        @Override
        public String toString() {
            return "S";
        }
    },M{
        @Override
        public String toString() {
            return "M";
        }
    },L{
        @Override
        public String toString() {
            return "L";
        }
    },XL{
        @Override
        public String toString() {
            return "XL";
        }
    };
}
