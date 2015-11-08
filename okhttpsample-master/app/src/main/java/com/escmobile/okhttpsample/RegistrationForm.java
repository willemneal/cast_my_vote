package com.escmobile.okhttpsample;
import com.google.gson.Gson;

public class RegistrationForm {



    private String lang = "en";
    private final String partner_id = "26206";
    private boolean send_confirmation_reminder_emails = false;
    private String collect_email_address = "no";
    private String source_tracking_id;
    private String partner_tracking_id;
    private boolean short_form;
    private String state_ovr_data;
    private String created_at  = "11-07-2015 21:56:30";
    private String updated_at = "11-07-2015 21:56:30";
    private String date_of_birth;
    private String id_number;
    private boolean first_registration = true;
    private String home_zip_code;
    private boolean us_citizen = true;
    private boolean has_state_license = true;
    private boolean is_eighteen_or_older = true;
    private String name_title;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String name_suffix;
    private String home_address;
    private String home_unit;
    private String home_city;
    private String home_state_id;
    private boolean has_mailing_address = false;
    private String mailing_address;
    private String mailing_unit;
    private String mailing_city;
    private String mailing_state_id;
    private String mailing_zip_code;
    private String race = "Decline to State";
    private String party;
    private String phone;
    private String phone_type;
    private boolean change_of_name = false;
    private String prev_name_title;
    private String prev_first_name;
    private String prev_middle_name;
    private String prev_last_name;
    private String prev_name_suffix;
    private boolean  change_of_address = false;
    private String prev_address;
    private String prev_unit;
    private String prev_city;
    private String prev_state_id;
    private String prev_zip_code;
    private boolean opt_in_email = false;
    private boolean opt_in_sms = false;
    private boolean opt_in_volunteer = false;
    private boolean partner_opt_in_email = false;
    private boolean partner_opt_in_sms = false;
    private boolean partner_opt_in_volunteer = false;
    private String survey_question_1;
    private String survey_answer_1;
    private String survey_question_2;
    private String survey_answer_2;
    private String callback;
    private String custom_stop_reminders_url;
    private boolean async;

    private static RegistrationForm form;

    public static RegistrationForm getRegistrationForm(){
        if (form ==null){
            form = new RegistrationForm();
        }
        return form;
    }

    


    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getPartner_id() {
        return partner_id;
    }

    public boolean isSend_confirmation_reminder_emails() {
        return send_confirmation_reminder_emails;
    }

    public void setSend_confirmation_reminder_emails(boolean send_confirmation_reminder_emails) {
        this.send_confirmation_reminder_emails = send_confirmation_reminder_emails;
    }


    public String getCollect_email_address() {
        return collect_email_address;
    }

    public void setCollect_email_address(String collect_email_address) {
        this.collect_email_address = collect_email_address;
    }

    public String getSource_tracking_id() {
        return source_tracking_id;
    }

    public void setSource_tracking_id(String source_tracking_id) {
        this.source_tracking_id = source_tracking_id;
    }

    public String getPartner_tracking_id() {
        return partner_tracking_id;
    }

    public void setPartner_tracking_id(String partner_tracking_id) {
        this.partner_tracking_id = partner_tracking_id;
    }

    public boolean isShort_form() {
        return short_form;
    }

    public void setShort_form(boolean short_form) {
        this.short_form = short_form;
    }

    public String getState_ovr_data() {
        return state_ovr_data;
    }

    public void setState_ovr_data(String state_ovr_data) {
        this.state_ovr_data = state_ovr_data;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public boolean isFirst_registration() {
        return first_registration;
    }

    public void setFirst_registration(boolean first_registration) {
        this.first_registration = first_registration;
    }

    public String getHome_zip_code() {
        return home_zip_code;
    }

    public void setHome_zip_code(String home_zip_code) {
        this.home_zip_code = home_zip_code;
    }

    public boolean isUs_citizen() {
        return us_citizen;
    }

    public void setUs_citizen(boolean us_citizen) {
        this.us_citizen = us_citizen;
    }

    public boolean isHas_state_license() {
        return has_state_license;
    }

    public void setHas_state_license(boolean has_state_license) {
        this.has_state_license = has_state_license;
    }

    public boolean is_eighteen_or_older() {
        return is_eighteen_or_older;
    }

    public void setIs_eighteen_or_older(boolean is_eighteen_or_older) {
        this.is_eighteen_or_older = is_eighteen_or_older;
    }

    public String getName_title() {
        return name_title;
    }

    public void setName_title(String name_title) {
        this.name_title = name_title;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName_suffix() {
        return name_suffix;
    }

    public void setName_suffix(String name_suffix) {
        this.name_suffix = name_suffix;
    }

    public String getHome_address() {
        return home_address;
    }

    public void setHome_address(String home_address) {
        this.home_address = home_address;
    }

    public String getHome_unit() {
        return home_unit;
    }

    public void setHome_unit(String home_unit) {
        this.home_unit = home_unit;
    }

    public String getHome_city() {
        return home_city;
    }

    public void setHome_city(String home_city) {
        this.home_city = home_city;
    }

    public String getHome_state_id() {
        return home_state_id;
    }

    public void setHome_state_id(String home_state_id) {
        this.home_state_id = home_state_id;
    }

    public boolean isHas_mailing_address() {
        return has_mailing_address;
    }

    public void setHas_mailing_address(boolean has_mailing_address) {
        this.has_mailing_address = has_mailing_address;
    }

    public String getMailing_address() {
        return mailing_address;
    }

    public void setMailing_address(String mailing_address) {
        this.mailing_address = mailing_address;
    }

    public String getMailing_unit() {
        return mailing_unit;
    }

    public void setMailing_unit(String mailing_unit) {
        this.mailing_unit = mailing_unit;
    }

    public String getMailing_city() {
        return mailing_city;
    }

    public void setMailing_city(String mailing_city) {
        this.mailing_city = mailing_city;
    }

    public String getMailing_state_id() {
        return mailing_state_id;
    }

    public void setMailing_state_id(String mailing_state_id) {
        this.mailing_state_id = mailing_state_id;
    }

    public String getMailing_zip_code() {
        return mailing_zip_code;
    }

    public void setMailing_zip_code(String mailing_zip_code) {
        this.mailing_zip_code = mailing_zip_code;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone_type() {
        return phone_type;
    }

    public void setPhone_type(String phone_type) {
        this.phone_type = phone_type;
    }

    public boolean isChange_of_name() {
        return change_of_name;
    }

    public void setChange_of_name(boolean change_of_name) {
        this.change_of_name = change_of_name;
    }

    public String getPrev_name_title() {
        return prev_name_title;
    }

    public void setPrev_name_title(String prev_name_title) {
        this.prev_name_title = prev_name_title;
    }

    public String getPrev_first_name() {
        return prev_first_name;
    }

    public void setPrev_first_name(String prev_first_name) {
        this.prev_first_name = prev_first_name;
    }

    public String getPrev_middle_name() {
        return prev_middle_name;
    }

    public void setPrev_middle_name(String prev_middle_name) {
        this.prev_middle_name = prev_middle_name;
    }

    public String getPrev_last_name() {
        return prev_last_name;
    }

    public void setPrev_last_name(String prev_last_name) {
        this.prev_last_name = prev_last_name;
    }

    public String getPrev_name_suffix() {
        return prev_name_suffix;
    }

    public void setPrev_name_suffix(String prev_name_suffix) {
        this.prev_name_suffix = prev_name_suffix;
    }

    public boolean isChange_of_address() {
        return change_of_address;
    }

    public void setChange_of_address(boolean change_of_address) {
        this.change_of_address = change_of_address;
    }

    public String getPrev_address() {
        return prev_address;
    }

    public void setPrev_address(String prev_address) {
        this.prev_address = prev_address;
    }

    public String getPrev_unit() {
        return prev_unit;
    }

    public void setPrev_unit(String prev_unit) {
        this.prev_unit = prev_unit;
    }

    public String getPrev_city() {
        return prev_city;
    }

    public void setPrev_city(String prev_city) {
        this.prev_city = prev_city;
    }

    public String getPrev_state_id() {
        return prev_state_id;
    }

    public void setPrev_state_id(String prev_state_id) {
        this.prev_state_id = prev_state_id;
    }

    public String getPrev_zip_code() {
        return prev_zip_code;
    }

    public void setPrev_zip_code(String prev_zip_code) {
        this.prev_zip_code = prev_zip_code;
    }

    public boolean isOpt_in_email() {
        return opt_in_email;
    }

    public void setOpt_in_email(boolean opt_in_email) {
        this.opt_in_email = opt_in_email;
    }

    public boolean isOpt_in_sms() {
        return opt_in_sms;
    }

    public void setOpt_in_sms(boolean opt_in_sms) {
        this.opt_in_sms = opt_in_sms;
    }

    public boolean isOpt_in_volunteer() {
        return opt_in_volunteer;
    }

    public void setOpt_in_volunteer(boolean opt_in_volunteer) {
        this.opt_in_volunteer = opt_in_volunteer;
    }

    public boolean isPartner_opt_in_email() {
        return partner_opt_in_email;
    }

    public void setPartner_opt_in_email(boolean partner_opt_in_email) {
        this.partner_opt_in_email = partner_opt_in_email;
    }

    public boolean isPartner_opt_in_sms() {
        return partner_opt_in_sms;
    }

    public void setPartner_opt_in_sms(boolean partner_opt_in_sms) {
        this.partner_opt_in_sms = partner_opt_in_sms;
    }

    public boolean isPartner_opt_in_volunteer() {
        return partner_opt_in_volunteer;
    }

    public void setPartner_opt_in_volunteer(boolean partner_opt_in_volunteer) {
        this.partner_opt_in_volunteer = partner_opt_in_volunteer;
    }

    public String getSurvey_question_1() {
        return survey_question_1;
    }

    public void setSurvey_question_1(String survey_question_1) {
        this.survey_question_1 = survey_question_1;
    }

    public String getSurvey_answer_1() {
        return survey_answer_1;
    }

    public void setSurvey_answer_1(String survey_answer_1) {
        this.survey_answer_1 = survey_answer_1;
    }

    public String getSurvey_question_2() {
        return survey_question_2;
    }

    public void setSurvey_question_2(String survey_question_2) {
        this.survey_question_2 = survey_question_2;
    }

    public String getSurvey_answer_2() {
        return survey_answer_2;
    }

    public void setSurvey_answer_2(String survey_answer_2) {
        this.survey_answer_2 = survey_answer_2;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public String getCustom_stop_reminders_url() {
        return custom_stop_reminders_url;
    }

    public void setCustom_stop_reminders_url(String custom_stop_reminders_url) {
        this.custom_stop_reminders_url = custom_stop_reminders_url;
    }

    public boolean isAsync() {
        return async;
    }

    public void setAsync(boolean async) {
        this.async = async;
    }
}
