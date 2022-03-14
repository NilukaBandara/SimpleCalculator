import org.junit.Test;

import static org.junit.Assert.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({AdditionTest.class, OperationIntegrationTest.class, DivisionTest.class, MultiplicationTest.class, SubtractionTest.class, OperationsTest.class})

public class SuiteTest {}