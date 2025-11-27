// package edu.gmu.i90;
// import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
// import static org.junit.jupiter.api.Assertions.assertThrows;
// import org.junit.jupiter.api.Test;

// /**
//  * This method performs unit tests, covering all the methods in Approve.java file.
//  * IMPORTANT NOTE: Some tests below passes where some fails (conceptually).
//  */
// public class ApproveTest 
// {
//     // Test 1 - Passes
//     @Test
//     void getReviewedApplicationValid() 
//     {
//         Approve a1 = new Approve();
//         assertDoesNotThrow(a1::getReviewedApplication);
//     }

//     // Test 1.1 - Fails
//     @Test
//     void getReviewedApplicationInvalid() 
//     {
//         Approve a2 = new Approve();
//         assertThrows(IllegalStateException.class, a2::getReviewedApplication);
//     }

//     // Test 2 - Passes
//     @Test
//     void createDecisionValid() 
//     {
//         Approve b1 = new Approve();
//         assertDoesNotThrow(b1::createDecision);
//     }

//     // Test 2.1 - Fails
//     @Test
//     void createDecisionInvalid() 
//     {
//         Approve b2 = new Approve();
//         assertThrows(IllegalArgumentException.class, b2::createDecision);
//     }

//     // Test 3 - Passes
//     @Test
//     void updateImmigrantValid() 
//     {
//         Approve c1 = new Approve();
//         assertDoesNotThrow(c1::updateImmigrant);
//     }

//     // Test 3.1 - Fails
//     @Test
//     void updateImmigrantInvalid() 
//     {
//         Approve c2 = new Approve();
//         assertThrows(IllegalStateException.class, c2::updateImmigrant);
//     }
// }