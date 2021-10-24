package com.example.svadhyaya.RetrofitModel;

import java.io.Serializable;
import java.util.List;

public class QuestionList implements Serializable {
    public String question_id;
    public String institute_id;
    public String subject_id;
    public String topic_id;
    public String question_no;
    public String reference_no;
    public String question_year;
    public String difficulty_level;
    public String question;
    public String solution;
    public String right_marks;
    public String negative_marks;
    public String question_type;
    public String used_for;
    public String images;
    public String entry_on;
    public String entry_by;
    public String modified_on;
    public String modified_by;
    public String test_question_id;
    public String test_id;
    public String sequence_no;
    public String test_group_id;
    public List<OptionsAnswers> options;
    public int answer_given;
    public int flaged;

    public QuestionList(String question_id, String institute_id, String subject_id, String topic_id, String question_no, String reference_no, String question_year, String difficulty_level, String question, String solution, String right_marks, String negative_marks, String question_type, String used_for, String images, String entry_on, String entry_by, String modified_on, String modified_by, String test_question_id, String test_id, String sequence_no, String test_group_id, List<OptionsAnswers> options, int answer_given, int flaged) {
        this.question_id = question_id;
        this.institute_id = institute_id;
        this.subject_id = subject_id;
        this.topic_id = topic_id;
        this.question_no = question_no;
        this.reference_no = reference_no;
        this.question_year = question_year;
        this.difficulty_level = difficulty_level;
        this.question = question;
        this.solution = solution;
        this.right_marks = right_marks;
        this.negative_marks = negative_marks;
        this.question_type = question_type;
        this.used_for = used_for;
        this.images = images;
        this.entry_on = entry_on;
        this.entry_by = entry_by;
        this.modified_on = modified_on;
        this.modified_by = modified_by;
        this.test_question_id = test_question_id;
        this.test_id = test_id;
        this.sequence_no = sequence_no;
        this.test_group_id = test_group_id;
        this.options = options;
        this.answer_given = answer_given;
        this.flaged = flaged;
    }

    public String getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(String question_id) {
        this.question_id = question_id;
    }

    public String getInstitute_id() {
        return institute_id;
    }

    public void setInstitute_id(String institute_id) {
        this.institute_id = institute_id;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public String getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(String topic_id) {
        this.topic_id = topic_id;
    }

    public String getQuestion_no() {
        return question_no;
    }

    public void setQuestion_no(String question_no) {
        this.question_no = question_no;
    }

    public String getReference_no() {
        return reference_no;
    }

    public void setReference_no(String reference_no) {
        this.reference_no = reference_no;
    }

    public String getQuestion_year() {
        return question_year;
    }

    public void setQuestion_year(String question_year) {
        this.question_year = question_year;
    }

    public String getDifficulty_level() {
        return difficulty_level;
    }

    public void setDifficulty_level(String difficulty_level) {
        this.difficulty_level = difficulty_level;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getRight_marks() {
        return right_marks;
    }

    public void setRight_marks(String right_marks) {
        this.right_marks = right_marks;
    }

    public String getNegative_marks() {
        return negative_marks;
    }

    public void setNegative_marks(String negative_marks) {
        this.negative_marks = negative_marks;
    }

    public String getQuestion_type() {
        return question_type;
    }

    public void setQuestion_type(String question_type) {
        this.question_type = question_type;
    }

    public String getUsed_for() {
        return used_for;
    }

    public void setUsed_for(String used_for) {
        this.used_for = used_for;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getEntry_on() {
        return entry_on;
    }

    public void setEntry_on(String entry_on) {
        this.entry_on = entry_on;
    }

    public String getEntry_by() {
        return entry_by;
    }

    public void setEntry_by(String entry_by) {
        this.entry_by = entry_by;
    }

    public String getModified_on() {
        return modified_on;
    }

    public void setModified_on(String modified_on) {
        this.modified_on = modified_on;
    }

    public String getModified_by() {
        return modified_by;
    }

    public void setModified_by(String modified_by) {
        this.modified_by = modified_by;
    }

    public String getTest_question_id() {
        return test_question_id;
    }

    public void setTest_question_id(String test_question_id) {
        this.test_question_id = test_question_id;
    }

    public String getTest_id() {
        return test_id;
    }

    public void setTest_id(String test_id) {
        this.test_id = test_id;
    }

    public String getSequence_no() {
        return sequence_no;
    }

    public void setSequence_no(String sequence_no) {
        this.sequence_no = sequence_no;
    }

    public String getTest_group_id() {
        return test_group_id;
    }

    public void setTest_group_id(String test_group_id) {
        this.test_group_id = test_group_id;
    }

    public List<OptionsAnswers> getOptions() {
        return options;
    }

    public void setOptions(List<OptionsAnswers> options) {
        this.options = options;
    }

    public int getAnswer_given() {
        return answer_given;
    }

    public void setAnswer_given(int answer_given) {
        this.answer_given = answer_given;
    }

    public int getFlaged() {
        return flaged;
    }

    public void setFlaged(int flaged) {
        this.flaged = flaged;
    }

    public class OptionsAnswers {
        public String option_id;
        public String question_id;
        public String option;
        public String images;
        public String is_correct;

        public OptionsAnswers(String option_id, String question_id, String option, String images, String is_correct) {
            this.option_id = option_id;
            this.question_id = question_id;
            this.option = option;
            this.images = images;
            this.is_correct = is_correct;
        }

        public String getOption_id() {
            return option_id;
        }

        public void setOption_id(String option_id) {
            this.option_id = option_id;
        }

        public String getQuestion_id() {
            return question_id;
        }

        public void setQuestion_id(String question_id) {
            this.question_id = question_id;
        }

        public String getOption() {
            return option;
        }

        public void setOption(String option) {
            this.option = option;
        }

        public String getImages() {
            return images;
        }

        public void setImages(String images) {
            this.images = images;
        }

        public String getIs_correct() {
            return is_correct;
        }

        public void setIs_correct(String is_correct) {
            this.is_correct = is_correct;
        }
    }
}
