package com.Aqeeb.JobApp2.repo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.Aqeeb.JobApp2.model.JobPost;

@Repository
public class JobRepo {

    // ArrayList to store JobPost objects
    List<JobPost> jobs = new ArrayList<>();

    // ****************************************************************************

    // Constructor -> injecting objects into ArrayList defined above
    public JobRepo() {

        // Java Developer Job Post
        jobs.add(new JobPost(1, "Java Developer",
            "Java developers are highly sought-after professionals in the software industry. They play a crucial role in developing scalable, maintainable, and high-performing software solutions. Their expertise in core and advanced Java allows businesses to create robust systems. In addition to technical proficiency, they are often expected to understand the full software development lifecycle. They collaborate with cross-functional teams to design and implement enterprise-level applications. Java developers ensure that the systems they create meet business goals and are optimized for future scalability.",
            2, List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));

        // Frontend Developer Job Post
        jobs.add(new JobPost(2, "Frontend Developer",
            "Frontend developers are responsible for designing and building the user-facing elements of web applications. They create responsive and interactive interfaces using HTML, CSS, and JavaScript frameworks like React. These developers work closely with UI/UX designers to ensure a seamless user experience across various devices. They are also responsible for optimizing web performance to deliver a fast and engaging user experience. Frontend developers often collaborate with backend developers to integrate APIs and server-side logic. Their role is essential in creating visually appealing and functional web applications.",
            3, List.of("HTML", "CSS", "JavaScript", "React")));

        // Data Scientist Job Post
        jobs.add(new JobPost(3, "Data Scientist",
            "Data scientists use their strong background in machine learning and data analysis to derive insights from complex datasets. They apply statistical techniques and machine learning algorithms to predict trends and make data-driven decisions. Data scientists are essential for businesses looking to leverage big data to gain competitive advantages. They collaborate with data engineers to ensure the data pipeline is clean and reliable. Additionally, they communicate findings to stakeholders and help guide business strategies. Their role is increasingly crucial as data becomes a core asset for companies.",
            4, List.of("Python", "Machine Learning", "Data Analysis")));

        // Network Engineer Job Post
        jobs.add(new JobPost(4, "Network Engineer",
            "Network engineers design, implement, and manage computer networks to facilitate efficient data communication. They ensure that the networks are secure, reliable, and scalable, optimizing them for both local and wide-area connections. Network engineers troubleshoot issues, configure routers, and switch settings for optimal performance. Their role also includes monitoring network traffic to prevent bottlenecks or unauthorized access. As businesses grow, network engineers play a critical role in ensuring that the infrastructure supports operational needs. They often work with other IT professionals to integrate network solutions.",
            5, List.of("Networking", "Cisco", "Routing", "Switching")));

        // Mobile App Developer Job Post
        jobs.add(new JobPost(5, "Mobile App Developer",
            "Mobile app developers specialize in creating applications for mobile platforms, primarily iOS and Android. Their work includes coding, testing, and deploying mobile apps that meet user needs and offer an intuitive experience. These developers often use programming languages such as Swift, Kotlin, and Java for app development. They must stay updated on the latest trends in mobile technology to deliver apps that are both functional and aesthetically pleasing. They collaborate closely with designers to ensure a consistent user experience. Additionally, mobile app developers focus on app security and performance.",
            3, List.of("iOS Development", "Android Development", "Mobile App")));

        // DevOps Engineer Job Post
        jobs.add(new JobPost(6, "DevOps Engineer",
            "DevOps engineers bridge the gap between development and operations by managing continuous integration and continuous delivery (CI/CD) pipelines. They ensure that code is efficiently built, tested, and deployed to production environments. DevOps engineers use automation tools like Jenkins, Docker, and Kubernetes to streamline software development processes. Their focus is on reducing manual intervention, improving deployment frequency, and ensuring reliable software releases. They also monitor system performance and work on infrastructure optimization. DevOps engineers play a crucial role in ensuring the scalability and reliability of IT operations.",
            4, List.of("DevOps", "CI/CD", "Docker", "Kubernetes")));

        // UI/UX Designer Job Post
        jobs.add(new JobPost(7, "UI/UX Designer",
            "UI/UX designers create engaging user experiences and intuitive user interfaces that align with user needs and business goals. They conduct user research and usability testing to gather insights into user behavior. UI/UX designers translate these insights into wireframes, prototypes, and high-fidelity designs that guide the development team. Their work ensures that products are not only functional but also enjoyable to use. They collaborate closely with frontend developers to ensure design implementation. UI/UX designers play a key role in enhancing customer satisfaction and driving product success.",
            2, List.of("User Experience", "User Interface Design", "Prototyping")));

        // Cybersecurity Analyst Job Post
        jobs.add(new JobPost(8, "Cybersecurity Analyst",
            "Cybersecurity analysts protect computer systems and networks from cyber threats such as hacking, malware, and data breaches. They implement security measures like firewalls, encryption, and intrusion detection systems to safeguard critical data. Cybersecurity analysts also monitor for suspicious activity and respond to incidents to mitigate damage. They conduct vulnerability assessments and security audits to identify weaknesses in systems. Additionally, they provide training and awareness programs for employees to reduce human error-related risks. Their work is crucial in protecting businesses from growing cyber threats.",
            4, List.of("Cybersecurity", "Network Security", "Incident Response")));

        // Full Stack Developer Job Post
        jobs.add(new JobPost(9, "Full Stack Developer",
            "Full stack developers are proficient in both front-end and back-end technologies, enabling them to build entire web applications from scratch. They handle everything from designing user interfaces to managing server-side logic and databases. Their ability to work across the stack allows them to create seamless integrations between the client and server. Full stack developers often work in teams but are capable of independently solving problems across the development spectrum. Their expertise in various technologies ensures that they can deliver fully functional, high-performance web applications.",
            5, List.of("JavaScript", "Node.js", "React", "Spring", "MongoDB")));

        // Cloud Architect Job Post
        jobs.add(new JobPost(10, "Cloud Architect",
            "Cloud architects design and implement cloud infrastructure solutions that are scalable, secure, and cost-effective. They work with cloud platforms like AWS, Azure, and Google Cloud to build cloud environments tailored to business needs. Their responsibilities include selecting the appropriate cloud services, designing cloud architecture, and ensuring smooth migration from on-premise solutions. Cloud architects also optimize cloud performance, manage security, and control costs. As businesses increasingly adopt cloud technologies, cloud architects play a vital role in ensuring reliable and efficient cloud operations.",
            6, List.of("Cloud Computing", "AWS", "Azure", "Google Cloud")));

        // Additional Job Posts with expanded descriptions...

        // Job Post 11
        jobs.add(new JobPost(11, "Software Tester",
            "Software testers ensure that software meets the highest quality standards before it reaches the end-user. They perform manual and automated testing to identify bugs, errors, and inconsistencies in software functionality. Software testers collaborate with developers to report issues and verify fixes. They use tools like JUnit, Selenium, and TestNG to automate testing processes. Their work ensures that software is reliable, efficient, and meets user expectations. Without thorough testing, software can be prone to critical failures that can affect user satisfaction and business success.",
            3, List.of("Testing", "JUnit", "Selenium", "TestNG")));

        // ... Continue adding more jobs with expanded descriptions ...
    }

    // ****************************************************************************

    // Method to return all JobPosts
    public List<JobPost> returnAllJobPosts() {
        return jobs;
    }

    // Method to save a job post object into ArrayList
    public void addJobPost(JobPost job) {
        jobs.add(job);
    }
}
