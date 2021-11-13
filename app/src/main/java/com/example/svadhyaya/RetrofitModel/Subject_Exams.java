package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Subject_Exams implements Serializable {
    public String package_test_id;
    public String package_id;
    public String division_id;
    public String test_id;
    public String subject_id;
    public String entry_on;
    public String entry_by;
    public Object modified_on;
    public String modified_by;
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
    public String package_name;
   // public List<Object> attempts;

    public String getPackage_test_id() {
        return package_test_id;
    }

    public void setPackage_test_id(String package_test_id) {
        this.package_test_id = package_test_id;
    }

    public String getPackage_id() {
        return package_id;
    }

    public void setPackage_id(String package_id) {
        this.package_id = package_id;
    }

    public String getDivision_id() {
        return division_id;
    }

    public void setDivision_id(String division_id) {
        this.division_id = division_id;
    }

    public String getTest_id() {
        return test_id;
    }

    public void setTest_id(String test_id) {
        this.test_id = test_id;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
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

    public Object getModified_on() {
        return modified_on;
    }

    public void setModified_on(Object modified_on) {
        this.modified_on = modified_on;
    }

    public String getModified_by() {
        return modified_by;
    }

    public void setModified_by(String modified_by) {
        this.modified_by = modified_by;
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

    public String getPackage_name() {
        return package_name;
    }

    public void setPackage_name(String package_name) {
        this.package_name = package_name;
    }
}
