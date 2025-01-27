let currentStep = 1;

function showStep(step) {
  document.querySelectorAll('.form-step').forEach((element) => {
    element.style.display = 'none';
  });
  document.getElementById(`step-${step}`).style.display = 'block';
}

function nextStep() {
  if (currentStep < 3) {
    currentStep++;
    showStep(currentStep);
  }
}

function prevStep() {
  if (currentStep > 1) {
    currentStep--;
    showStep(currentStep);
  }
}

// Initialize the form
showStep(currentStep);
