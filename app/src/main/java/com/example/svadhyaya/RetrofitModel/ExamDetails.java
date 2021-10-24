package com.example.svadhyaya.RetrofitModel;

import java.io.Serializable;

public class ExamDetails implements Serializable {

    public String test_id;
    public String institute_id;
    public String instruction_id;
    public String name;
    public String code;
    public String description;
    public String is_free;
    public String test_type;
    public String exam_type;
    public Object examsubtype;
    public String start_date;
    public Object end_date;
    public String start_time;
    public String duration;
    public String total_questions;
    public String total_marks;
    public String passing_score;
    public String publish;
    public String subjectwise_grouping;
    public String question_order_shuffling;
    public String option_shuffling;
    public String attempts_allowed;
    public String time_bound;
    public String clock_format;
    public String show_score;
    public String show_passing_status;
    public String show_test_report;
    public String show_solutions;
    public String notify_parents;
    public String images;
    public String entry_on;
    public String entry_by;
    public String modified_on;
    public String modified_by;

    public ExamDetails(String test_id, String institute_id, String instruction_id, String name, String code, String description, String is_free, String test_type, String exam_type, Object examsubtype, String start_date, Object end_date, String start_time, String duration, String total_questions, String total_marks, String passing_score, String publish, String subjectwise_grouping, String question_order_shuffling, String option_shuffling, String attempts_allowed, String time_bound, String clock_format, String show_score, String show_passing_status, String show_test_report, String show_solutions, String notify_parents, String images, String entry_on, String entry_by, String modified_on, String modified_by) {
        this.test_id = test_id;
        this.institute_id = institute_id;
        this.instruction_id = instruction_id;
        this.name = name;
        this.code = code;
        this.description = description;
        this.is_free = is_free;
        this.test_type = test_type;
        this.exam_type = exam_type;
        this.examsubtype = examsubtype;
        this.start_date = start_date;
        this.end_date = end_date;
        this.start_time = start_time;
        this.duration = duration;
        this.total_questions = total_questions;
        this.total_marks = total_marks;
        this.passing_score = passing_score;
        this.publish = publish;
        this.subjectwise_grouping = subjectwise_grouping;
        this.question_order_shuffling = question_order_shuffling;
        this.option_shuffling = option_shuffling;
        this.attempts_allowed = attempts_allowed;
        this.time_bound = time_bound;
        this.clock_format = clock_format;
        this.show_score = show_score;
        this.show_passing_status = show_passing_status;
        this.show_test_report = show_test_report;
        this.show_solutions = show_solutions;
        this.notify_parents = notify_parents;
        this.images = images;
        this.entry_on = entry_on;
        this.entry_by = entry_by;
        this.modified_on = modified_on;
        this.modified_by = modified_by;
    }

    public String getTest_id() {
        return test_id;
    }

    public void setTest_id(String test_id) {
        this.test_id = test_id;
    }

    public String getInstitute_id() {
        return institute_id;
    }

    public void setInstitute_id(String institute_id) {
        this.institute_id = institute_id;
    }

    public String getInstruction_id() {
        return instruction_id;
    }

    public void setInstruction_id(String instruction_id) {
        this.instruction_id = instruction_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIs_free() {
        return is_free;
    }

    public void setIs_free(String is_free) {
        this.is_free = is_free;
    }

    public String getTest_type() {
        return test_type;
    }

    public void setTest_type(String test_type) {
        this.test_type = test_type;
    }

    public String getExam_type() {
        return exam_type;
    }

    public void setExam_type(String exam_type) {
        this.exam_type = exam_type;
    }

    public Object getExamsubtype() {
        return examsubtype;
    }

    public void setExamsubtype(Object examsubtype) {
        this.examsubtype = examsubtype;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public Object getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Object end_date) {
        this.end_date = end_date;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTotal_questions() {
        return total_questions;
    }

    public void setTotal_questions(String total_questions) {
        this.total_questions = total_questions;
    }

    public String getTotal_marks() {
        return total_marks;
    }

    public void setTotal_marks(String total_marks) {
        this.total_marks = total_marks;
    }

    public String getPassing_score() {
        return passing_score;
    }

    public void setPassing_score(String passing_score) {
        this.passing_score = passing_score;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getSubjectwise_grouping() {
        return subjectwise_grouping;
    }

    public void setSubjectwise_grouping(String subjectwise_grouping) {
        this.subjectwise_grouping = subjectwise_grouping;
    }

    public String getQuestion_order_shuffling() {
        return question_order_shuffling;
    }

    public void setQuestion_order_shuffling(String question_order_shuffling) {
        this.question_order_shuffling = question_order_shuffling;
    }

    public String getOption_shuffling() {
        return option_shuffling;
    }

    public void setOption_shuffling(String option_shuffling) {
        this.option_shuffling = option_shuffling;
    }

    public String getAttempts_allowed() {
        return attempts_allowed;
    }

    public void setAttempts_allowed(String attempts_allowed) {
        this.attempts_allowed = attempts_allowed;
    }

    public String getTime_bound() {
        return time_bound;
    }

    public void setTime_bound(String time_bound) {
        this.time_bound = time_bound;
    }

    public String getClock_format() {
        return clock_format;
    }

    public void setClock_format(String clock_format) {
        this.clock_format = clock_format;
    }

    public String getShow_score() {
        return show_score;
    }

    public void setShow_score(String show_score) {
        this.show_score = show_score;
    }

    public String getShow_passing_status() {
        return show_passing_status;
    }

    public void setShow_passing_status(String show_passing_status) {
        this.show_passing_status = show_passing_status;
    }

    public String getShow_test_report() {
        return show_test_report;
    }

    public void setShow_test_report(String show_test_report) {
        this.show_test_report = show_test_report;
    }

    public String getShow_solutions() {
        return show_solutions;
    }

    public void setShow_solutions(String show_solutions) {
        this.show_solutions = show_solutions;
    }

    public String getNotify_parents() {
        return notify_parents;
    }

    public void setNotify_parents(String notify_parents) {
        this.notify_parents = notify_parents;
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
}
