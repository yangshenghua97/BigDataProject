package Local;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class Test {
    public static void main(String[] args) {
        String master = "master";
        String AppName = "JavaTest";
        SparkConf conf = new SparkConf().setAppName(AppName).setMaster(master);
        JavaSparkContext sc = new JavaSparkContext(conf);
    }

}
