function showCourses(){
    fetch("http://localhost:8080/courses")
    .then((response)=>response.json())
    .then((courses)=>{
        const dataTable=document.getElementById("coursetable")
        courses.forEach((course) => {
            var row=`<tr>
            <td>${course.courseID}</td>
             <td>${course.courseName}</td>
              <td>${course.Trainer}</td>
               <td>${course.DurationInWeeks}</td>
            </tr>`
            dataTable.innerHTML+=row;
            
        });
    })
}

function showEnrolled(){
    fetch("http://localhost:8080/courses/enrolledStudents")
     .then((response)=>response.json())
    .then((courses)=>{
        const dataTable=document.getElementById("enrolledtable")
        courses.forEach((course) => {
            var row=`<tr>
            <td>${course.name}</td>
             <td>${course.emailId}</td>
              <td>${course.courseName}</td>
             
            </tr>`
            dataTable.innerHTML+=row;
            
        });
    })
}