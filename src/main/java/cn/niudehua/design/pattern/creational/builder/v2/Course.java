package cn.niudehua.design.pattern.creational.builder.v2;

/**
 * @author: deng
 * @datetime: 2020/6/22 9:31 下午
 * @desc:
 */
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

    public Course(CourseBuild courseBuild) {
        this.courseName = courseBuild.courseName;
        this.coursePPT = courseBuild.coursePPT;
        this.courseVideo = courseBuild.courseVideo;
        this.courseArticle = courseBuild.courseArticle;
        this.courseQA = courseBuild.courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public static class CourseBuild {
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;

        public CourseBuild buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuild buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuild buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuild buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuild buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }

}
