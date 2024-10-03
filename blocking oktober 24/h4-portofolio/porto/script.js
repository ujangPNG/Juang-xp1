document.addEventListener('DOMContentLoaded', () => {
    const sections = document.querySelectorAll('section:not(:first-of-type)');

    gsap.registerPlugin(ScrollTrigger);

    // Pin-spacer effect
    gsap.to(".pin-content", {
        y: "-100%",
        ease: "none",
        scrollTrigger: {
            trigger: "#pin-spacer",
            start: "top top",
            end: "bottom top",
            scrub: 1,
            pin: true,
            end: "+=120%",
        }
    });

    // Skills and Favorites transition
    const tl = gsap.timeline({
        scrollTrigger: {
            trigger: "#pin-spacer",
            start: "top top",
            end: "bottom top",
            scrub: 1,
        }
    });

    tl.to(".skills-section", { opacity: 0, y: "-25%", duration: 0.3 })
      .to(".favorites-section", { opacity: 1, y: "0%", duration: 0.3 }, "-=0.3");

    // Fade-in effect for other sections
    const fadeInOnScroll = (entries, observer) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                gsap.to(entry.target, {
                    opacity: 1,
                    y: 0,
                    duration: 0.6,
                    ease: "power2.out"
                });
                observer.unobserve(entry.target);
            }
        });
    };

    const observer = new IntersectionObserver(fadeInOnScroll, {
        root: null,
        threshold: 0.1
    });

    sections.forEach(section => {
        observer.observe(section);
    });
});
