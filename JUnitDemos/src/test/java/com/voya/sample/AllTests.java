package com.voya.sample;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import com.voya.testcases.CalculatorTest;
import com.voya.training.Calculator;

@RunWith(JUnitPlatform.class)
@SelectPackages({ "com.voya.testcases" })
//@ExcludePackages({"com.voya.testcases.trail.greet","com.voya.testcases.trail"})
//@SelectClasses({CalculatorTest.class})
//@IncludeTags({"First","Simple","Negative"})
@ExcludeTags({ "First" })
public class AllTests {

}
